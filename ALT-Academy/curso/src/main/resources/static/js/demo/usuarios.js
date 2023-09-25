// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    // Agregar aqui el nombre del metodo que cargara los usuarios
  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }

  });
  const usuarios = await request.json();
  console.log(usuarios);
  //Aqui comienza el relleno dinamico de mis objetos de tabla
    let estructuraHTML;
  // Generar estructura fila
   for(let usuario of usuarios){
    let u =`<tr> <td>${usuario.id}</td> <td>${usuario.nombre} ${usuario.apellido}</td> <td>${usuario.email}</td> <td>${usuario.telefono}</td> <td> <a href="#" class="btn btn-danger btn-circle"> <i class="fas fa-trash"></i> </a> </td> </tr>`;
    estructuraHTML+=u;

    }
    document.querySelector('#usuarios tbody').outerHTML = estructuraHTML;

}