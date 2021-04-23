import { createRouter, createWebHistory } from 'vue-router'
import Home from '../page/home.vue'
import DDB from '../page/ddb.vue'
import Project from '../page/project.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/ddb',
    name: 'DDB',
    component: DDB
  },
  {
    path: '/project',
    name: 'Project',
    component: Project
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
