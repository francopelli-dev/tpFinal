window.addEventListener('load',function() {
    console.log('La pagina se cargo');
    mostrarProductosBase();
})


async function mostrarProductosBase() {
    const request = await fetch('/api/productosbase', {
        method: 'GET',
        headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
              
        },
  
      });
      const productosBase = await request.json();
      console.log(productosBase);
      let listadoProductos = '';
      for(let producto of productosBase) {
            let productoHtml = `<li>
            <h2>${producto.nombre}</h2>
            <p>${producto.precioBase}</p>
            <p>${producto.descripcion}</p>
            <p>${producto.tiempoFabricacion}</p>
            <img src="${producto.url}" alt="">
        </li>`
        listadoProductos += productoHtml;
      }

      let productos = document.getElementById("productos");
      productos.innerHTML = listadoProductos;

}