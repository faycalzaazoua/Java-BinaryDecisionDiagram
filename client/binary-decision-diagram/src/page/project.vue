<template>
  <div class="my-24">
    <h1 class="text-5xl">Diagramme de décision binaire</h1>
  </div>
  <div class="mx-20 rounded-xl border-gray-200 border shadow-xl space-y-1.5 p-5">
    <projectCard @click="openProject(project.name)" v-for="project in this.projectList" :key="project.name" :dateCreation="project.date" :projectName="project.name"></projectCard>
  </div>
</template>

<script>
import projectCard from '../components/projectCard.vue'

export default {
  components: {
    projectCard,
  },

  data(){
    return{
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
      console.log(projectName)
    }
  },
}
</script>

<style>

</style>
