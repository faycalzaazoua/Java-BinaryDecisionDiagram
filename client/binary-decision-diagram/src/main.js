import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import Toaster from '@meforma/vue-toaster'
import './index.css'
import './assets/tailwind.css'

import VueBlocksTree from 'vue3-blocks-tree';
import 'vue3-blocks-tree/dist/vue3-blocks-tree.css';

let defaultoptions = {treeName:'blocks-tree'}

createApp(App)
            .use(router)
            .use(VueBlocksTree,defaultoptions)
            .use(Toaster)
            .mount('#app')
