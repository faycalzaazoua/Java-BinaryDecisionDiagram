<template>
    <!-- Header -->
    <Header/>
    <!-- Body -->
    <router-view/>
</template>


<script>
  import Header from './components/Header.vue'

  export default {
    components: {
      Header,
    }
  }

</script>

<style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    text-align: center;
  }
</style>