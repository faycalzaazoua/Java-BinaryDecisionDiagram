<template>
  <div class="my-24">
    <h1 class="text-3xl xl:text-4xl 2xl:text-5xl">Diagramme de décision binaire</h1>
  </div>
  <div class="w-full flex justify-center">
    <div class="grid grid-cols-1 space-y-28 w-full mx-40">
      <div>
          <input class="w-full tracking-wide py-2 px-4 leading-relaxed appearance-none block bg-white border border-red-500 rounded focus:outline-none focus:via-pink-600 focus:bg-gray-100 focus:border-red-800 focus:border-8" 
          type="text" v-model="search" placeholder="Veuillez entrer votre expression..."/>
      </div>
      <div>
        <span class="text-2xl xl:text-3xl 2xl:text-4xl">Que souhaitez-vous faire ?</span>
      </div>
      <div class="grid grid-cols-4 gap-20 xl:gap-32 mx-auto rounded-xl text-sm xl:text-base 2xl:text-xl text-white">
        <div class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire</span>
        </div>
        <div class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire réduit</span>
        </div>
        <div class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire sans noeud inutile</span>
        </div>
        <div class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire sans graphe isomorphe</span>
        </div>
      </div>
    </div>
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
