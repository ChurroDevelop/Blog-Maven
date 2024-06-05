<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link href="https://cdn.jsdelivr.net/npm/daisyui@4.10.2/dist/full.min.css" rel="stylesheet" type="text/css" />
  <link rel="stylesheet" href="Views/Assets/style/Fondo.css"/>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
    integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />
  <script src="https://cdn.tailwindcss.com"></script>
  <script src="Views/Assets/Js/tailwind.config.js"></script>
  <title>Index - TDA Sena</title>
</head>

<body class="flex bg-meWhite fondoGradient">
  <nav class="bg-white p-7 shadow-md sticky top-0 h-screen">
    <div class="grid gap-y-5">
      <hr />
      <form action="">
        <label class="input input-bordered flex items-center gap-2 bg-white">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" fill="currentColor" class="w-4 h-4 opacity-70">
            <path fill-rule="evenodd"
              d="M9.965 11.026a5 5 0 1 1 1.06-1.06l2.755 2.754a.75.75 0 1 1-1.06 1.06l-2.755-2.754ZM10.5 7a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Z"
              clip-rule="evenodd" />
          </svg>
          <input type="text" class="grow text-meBlack" placeholder="Search" />
        </label>
      </form>
      <hr />
      <div>
        <a href="Views/Assets/Pages/ingreso.jsp">
          <button class="btn w-full mb-2.5 bg-meGreen border-none text-white hover:bg-meGreen">
            Ingrese
          </button>
        </a>
        <a href="Views/Assets/Pages/registro.jsp">
          <button class="btn w-full border-meBlack bg-white text-meBlack hover:bg-white">
            Regístrese
          </button>
        </a>
      </div>
    </div>
  </nav>
  <section class="m-auto flex w-full max-w-screen-2xl min-h-screen justify-center p-5 gap-5 flex-wrap content-start">
    <article class="bg-white w-full max-w-2xl h-44 shadow-md rounded-lg p-5 flex flex-col justify-between">
      <div class="text-meBlack text-sm">
        <p><b>Nombre aprendiz</b> de <b>Programa de formación</b></p>
        <p>Fecha</p>
      </div>
      <div class="text-meGreen">
        <h2 class="text-4xl mb-2"><b>TITULO DEL POST 1</b></h2>
        <a class="text-base hover:underline" href="#">Nombre del documento.docx
          <i class="fa-solid fa-arrow-down"></i>
        </a>
      </div>
    </article>
  </section>
</body>

</html>
