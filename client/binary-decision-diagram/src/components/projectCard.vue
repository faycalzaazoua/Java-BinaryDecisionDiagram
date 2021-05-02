<template>
    <div class="w-full Button bg-gray-200 text-black flex justify-between">
      <span> {{projectName}} </span>
      <span> {{dateCreation}} </span>
    </div>
</template>

<script>

export default {
    name: 'Project Card',

    props: ['projectName', 'dateCreation'],
    
    data () {
        return {
        }
    },
    
    methods: {
        
    },
}
</script>