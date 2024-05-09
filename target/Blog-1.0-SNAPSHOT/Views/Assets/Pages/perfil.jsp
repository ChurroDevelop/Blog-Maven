<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://cdn.jsdelivr.net/npm/daisyui@4.10.2/dist/full.min.css" rel="stylesheet" type="text/css" />
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
        integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="../Js/tailwind.config.js"></script>
    <title>Perfil - TDA Sena</title>
</head>

<body class="bg-meWhite grid content-center justify-center min-h-screen w-full">
    <section class="grid bg-white p-7 rounded-lg shadow-md w-96">
        <h3 class="text-meBlack text-xl mb-7">Bienvenido, ingrese los siguientes datos y cree su perfil</h3>
        <form class="grid" action="inicio.jsp   ">
            <label class="bg-white text-meBlack input input-bordered flex items-center gap-2 mb-4">
                <i class="fa-solid fa-user opacity-70"></i>
                <input type="text" class="grow text-meBlack" placeholder="Nombre" />
            </label>
            <label class="bg-white text-meBlack input input-bordered flex items-center gap-2 mb-4">
                <i class="fa-solid fa-user opacity-70"></i>
                <input type="text" class="grow text-meBlack" placeholder="Apellidos" />
            </label>
            <label class="bg-white text-meBlack input input-bordered flex items-center gap-2 mb-4">
                <i class="fa-solid fa-id-card opacity-70"></i>
                <input type="text" class="grow text-meBlack" placeholder="Número de documento" />
            </label>
            <label class="bg-white text-meBlack input input-bordered flex items-center gap-2 mb-4">
                <i class="fa-solid fa-location-pin opacity-70"></i>
                <input type="text" class="grow text-meBlack" placeholder="Centro de formación" />
            </label>
            <button class="btn bg-meGreen border-none text-white hover:bg-meGreen">Crear perfil</button>
        </form>
    </section>
</body>

</html>
