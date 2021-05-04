<template>
  <div class="my-24">
    <h1 class="text-5xl">Diagramme de décision binaire</h1>
  </div>
  <div class="mx-20 rounded-xl border-gray-200 border shadow-xl space-y-1.5 p-5">
    <projectCard @click="openProject(project.name)" v-for="project in this.projectList" :key="project.name" :dateCreation="project.date" :projectName="project.name"></projectCard>
  </div>
  <transition-group name="fade">
    <div v-if="showTree" class="p-10 m-20 flex flex-col justify-center rounded-xl border-gray-200 border shadow-xl">
        <div>
          <h1 class="font-bold text-xl"> {{project}}</h1>
          <p>Expression : {{expression}}</p>
        </div>
        <div class="w-full flex justify-center mt-10">
          <Tree
            :json="data"
            :class="{ landscape: landscape.length }"
            @click-node="clickNode">
          </Tree>
        </div>
    </div>
  </transition-group>
</template>

<script>
  import projectCard from '../components/projectCard.vue'
  import Tree from '../components/tree.vue'

export default {
  components: {
    projectCard,
    Tree,
  },

  data(){
    return{
      showTree: false,
      project: '',
      expression: '',
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
      //Simulation de donnée
      projectList:[
        {
          name:'Project 1',
          date:'20/05/2020',
          expression:'',
          etat:'Complet',
        },
        {
          name:'Project 2',
          date:'20/10/2020',
          expression:'',
          etat:'Complet',
        },
        {
          name:'Project 3',
          date:'05/01/2020',
          expression:'',
          etat:'Complet',
        },
      ]
    }
  },
  
  methods: {
    openProject(projectName){
      this.project = projectName
      if(!this.showTree) {this.showTree = !this.showTree}
      console.log(projectName)
      this.dataFictif(projectName)
    },

    dataFictif(projectName){
      switch(projectName){
        case 'Project 1':
          this.expression = "f(a,b,c) = a.c + a.b"
          this.data = {
            name: "A",
            class: ["rootNode"],
            children: [
              {
                name: "B",
                children: [
                  {
                    name: "C",
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
                    name: "D",
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
                name: "1",
              },
            ],
          }
        break;
        case 'Project 2':
          this.expression = "f(a,b,c) = a.b + a.c"
          this.data = {
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
          }
        break;
        case 'Project 3':
          this.expression = "f(a,b,c) = a.b.c + a.b"
          this.data = {
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
                    name: "0",
                  },
                  {
                    name: "1",
                  },
                ],
              },
            ],
          }
        break;
      }
    }
  },
}
</script>

<style>
.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.5s ease;
}

.fade-enter-from,
.fade-leave-to {
  opacity: 0;
}

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
