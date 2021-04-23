<template>
  <div class="space-x-2 mr-3 ms:mr-10 flex justify-end text-xs ms:text-md xl:text-base">
    <div class="h-0 md:h-auto space-x-2 absolute left-0 ml-6 flex justify-between text-xl">
      <p class="text-xl">Guest</p>
      <p v-if="userAuthenticated">Hi, {{actualUser.username}}</p>
    </div>
    <button class="bg-red-500 shadow-lg rounded-sm px-3 py-1 font-bold Button">Log Out</button>
    <button class="bg-red-700 shadow-lg rounded-sm px-3 py-1 font-bold Button">Mes Projets</button>
    <button class="bg-blue-500 shadow-lg rounded-sm px-3 py-1 font-bold Button">Log In</button>
    <button class="bg-green-500 shadow-lg rounded-sm px-3 py-1 font-bold Button">Sign Up</button>
  </div>
</template>

<script>

export default {
  components: {
      
  }
}
</script>

<style>

</style>
