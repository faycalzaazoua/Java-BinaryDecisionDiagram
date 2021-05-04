<template>
  <div class="my-24">
    <h1 class="text-3xl xl:text-4xl 2xl:text-5xl">Diagramme de décision binaire</h1>
  </div>
  <div class="w-full flex justify-center">
    <div class="grid grid-cols-1 space-y-20 xl:space-y-24 2xl:space-y-28 w-full mx-40">
      <div>
          <input class="w-full tracking-wide py-2 px-4 leading-relaxed appearance-none block bg-white border border-red-500 rounded focus:outline-none focus:via-pink-600 focus:bg-gray-100 focus:border-red-800 focus:border-8" 
          type="text" v-model="expression" placeholder="Veuillez entrer votre expression..."/>
      </div>
      <div>
        <span class="text-2xl xl:text-3xl 2xl:text-4xl">Que souhaitez-vous faire ?</span>
      </div>
      <div class="grid grid-cols-4 gap-20 xl:gap-32 mx-auto rounded-xl text-sm xl:text-base 2xl:text-xl text-white">
        <div @click="createBDD()" class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire</span>
        </div>
        <div @click="createBDDReduct()" class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire réduit</span>
        </div>
        <div @click="createBDDWithoutUselesNode()" class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire sans noeud inutile</span>
        </div>
        <div @click="createBDDWithoutIsomorph()" class="h-24 xl:h-36 2xl:h-52 w-40 xl:w-60 2xl:w-80 bg-red-500 rounded-xl Card relative justify-center items-center grid grid-cols-1">
          <span>Un diagramme de décision binaire sans graphe isomorphe</span>
        </div>
      </div>
    </div>
  </div>
  <div class="p-10 m-20 flex justify-center rounded-xl border-gray-200 border shadow-xl">
    <Tree
      :json="data"
      :class="{ landscape: landscape.length }"
      @click-node="clickNode">
    </Tree>
  </div>
</template>

<script>
  import Tree from '../components/tree.vue'

  export default {
    components: {
      Tree,
    },

    data() {
      return {
        landscape: [],
        data: {
          name: "A",
          class: ["rootNode"],
          children: [
            {
              name: "B",
              children: [
                {
                  name: "D",
                  children: [
                    {
                      name: "0",
                    },
                    {
                      name: "1",
                    },
                  ],
                },
                {
                  name: "E",
                  children: [
                    {
                      name: "1",
                    },
                    {
                      name: "1",
                    },
                  ],
                },
              ],
            },
            {
              name: "C",
              children: [
                {
                  name: "F",
                  children: [
                    {
                      name: "0",
                    },
                    {
                      name: "1",
                    },
                  ],
                },
                {
                  name: "G",
                  children: [
                    {
                      name: "0",
                    },
                    {
                      name: "0",
                    },
                  ],
                },
              ],
            },
          ],
        },
      };
    },
    
    methods: {
      createBDD(){
        if(this.expression) {
          console.log("Créer DDB")
          console.log(this.expression)
        } else {
          console.log("Error cannot create BDD")
          this.$toast.error(`Entrer une expression correct s'il vous plait.`, {position:"top", duration: 1000, max:3});
        }
      },

      createBDDReduct(){
        if(this.expression) {
          console.log("DDB Réduit")
          console.log(this.expression)
        } else {
          console.log("Error cannot create BDD")
          this.$toast.error(`Entrer une expression correct s'il vous plait.`, {position:"top", duration: 1000, max:3});
        }
      },

      createBDDWithoutUselesNode(){
        if(this.expression) {
          console.log("DDB sans noeud réduit")
          console.log(this.expression)
        } else {
          console.log("Error cannot create BDD")
          this.$toast.error(`Entrer une expression correct s'il vous plait.`, {position:"top", duration: 1000, max:3});
        }
      },

      createBDDWithoutIsomorph(){
        if(this.expression) {
          console.log("DDB sans graphe isomorphe")
          console.log(this.expression)
        } else {
          console.log("Error cannot create BDD")
          this.$toast.error(`Entrer une expression correct s'il vous plait.`, {position:"top", duration: 1000, max:3});
        }
      }
    },
  }
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
#app .avat {
  border-radius: 2em;
  border-width: 2px;
}
#app .name {
  font-weight: 700;
}
#app .rootNode .name {
  color: red;
}
.foot {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background: #333;
  padding: 24px;
  overflow: hidden;
  color: #999;
  font-size: 14px;
  text-align: center;
}
.foot a {
  color: #fff;
  margin: 0 0.5em;
}
</style>
