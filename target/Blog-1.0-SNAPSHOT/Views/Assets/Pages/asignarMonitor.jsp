<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/daisyui@4.10.2/dist/full.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
      integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="../Js/tailwind.config.js"></script>
    <title>Asignar monitor - TDA Sena</title>
  </head>
  <body class="flex bg-meWhite">
    <nav class="bg-white p-7 shadow-md sticky top-0 h-screen">
      <div class="grid gap-y-5">
        <hr />
        <label class="input input-bordered flex items-center gap-2 bg-white">
          <svg
            xmlns="http://www.w3.org/2000/svg"
            viewBox="0 0 16 16"
            fill="currentColor"
            class="w-4 h-4 opacity-70"
          >
            <path
              fill-rule="evenodd"
              d="M9.965 11.026a5 5 0 1 1 1.06-1.06l2.755 2.754a.75.75 0 1 1-1.06 1.06l-2.755-2.754ZM10.5 7a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Z"
              clip-rule="evenodd"
            />
          </svg>
          <input type="text" class="grow text-meBlack" placeholder="Search" />
        </label>
        <hr />
        <div>
          <a href="inicio.jsp">
            <button
              class="btn bg-transparent shadow-none w-full border-none text-meBlack hover:bg-transparent flex justify-start">
              <i class="fa-solid fa-house"></i>
              Inicio
            </button>
          </a>
          <a href="asignarMonitor.jsp">
            <button
              class="btn bg-transparent shadow-none w-full border-none text-meBlack hover:bg-transparent flex justify-start">
              <i class="fa-solid fa-user-plus"></i>
              Asignar monitor
            </button>
          </a>
          <a href="#">
            <button
              class="btn bg-transparent shadow-none w-full border-none text-meBlack hover:bg-transparent flex justify-start">
              <i class="fa-solid fa-bell"></i>
              Notificaciones
            </button>
          </a>
          <a href="#">
            <button
              class="btn bg-transparent shadow-none w-full border-none text-meBlack hover:bg-transparent flex justify-start">
              <i class="fa-regular fa-address-card"></i>
              Perfil
            </button>
          </a>
        </div>
      </div>
    </nav>
    <section
      class="m-auto flex w-full max-w-screen-2xl min-h-screen justify-center p-5 gap-5 flex-wrap content-center"
    >
      <article
        class="bg-white w-full max-w-2xl shadow-md rounded-lg p-5 flex flex-col gap-y-5"
      >
        <div class="flex justify-between">
          <h3 class="text-meBlack">Administrar monitores</h3>
          <button
            class="btn bg-meGreen border-none text-white hover:bg-meGreen"
          >
            Ingrese
          </button>
        </div>
        <form action="">
          <label class="input input-bordered flex items-center gap-2 bg-white">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 16 16"
              fill="currentColor"
              class="w-4 h-4 opacity-70"
            >
              <path
                fill-rule="evenodd"
                d="M9.965 11.026a5 5 0 1 1 1.06-1.06l2.755 2.754a.75.75 0 1 1-1.06 1.06l-2.755-2.754ZM10.5 7a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Z"
                clip-rule="evenodd"
              />
            </svg>
            <input type="text" class="grow text-meBlack" placeholder="Search" />
          </label>
        </form>
        <hr />
        <div class="bg-meWhite rounded-lg">
          <div class="flex justify-between items-center px-5 py-2.5">
            <div class="text-meBlack">
              <i class="fa-regular fa-address-card pr-2"></i>
              Daniel Acetaminofén
            </div>
            <button
              class="btn bg-red-600 border-none text-white hover:bg-red-600"
            >
              Quitar monitor
            </button>
          </div>
          <div class="flex justify-between items-center px-5 py-2.5">
            <div class="text-meBlack">
              <i class="fa-regular fa-address-card pr-2"></i>
              Sebastián Ibuprofeno
            </div>
            <button
              class="btn bg-red-600 border-none text-white hover:bg-red-600"
            >
              Quitar monitor
            </button>
          </div>
          <div class="flex justify-between items-center px-5 py-2.5">
            <div class="text-meBlack">
              <i class="fa-regular fa-address-card pr-2"></i>
              Jhon Fenilefrina
            </div>
            <button
              class="btn bg-red-600 border-none text-white hover:bg-red-600"
            >
              Quitar monitor
            </button>
          </div>
          <div class="flex justify-between items-center px-5 py-2.5">
            <div class="text-meBlack">
              <i class="fa-regular fa-address-card pr-2"></i>
              Yesid Clorferinamina
            </div>
            <button
              class="btn bg-red-600 border-none text-white hover:bg-red-600"
            >
              Quitar monitor
            </button>
          </div>
        </div>
      </article>
    </section>
  </body>
</html>

