import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import Toaster from '@meforma/vue-toaster'
import './index.css'
import './assets/tailwind.css'

createApp(App).use(router).use(router).use(Toaster).mount('#app')
