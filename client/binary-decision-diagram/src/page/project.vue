<template>
  <div class="my-24">
    <h1 class="text-5xl">Diagramme de décision binaire</h1>
  </div>
  <div class="w-full flex justify-center">
    <div class="grid grid-cols-1 space-y-28 w-full mx-40">
      <div>
          <input class="w-full tracking-wide py-2 px-4 leading-relaxed appearance-none block bg-white border border-red-500 rounded focus:outline-none focus:via-pink-600 focus:bg-gray-100 focus:border-red-800 focus:border-8" 
          type="text" v-model="search" placeholder="Veuillez entrer votre expression..."/>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  components: {

  },
}
</script>

<style>
    #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
    }
</style>
