<template>
  <div id="app">
    <template v-if="route.path.startsWith('/user')">
      <router-view />
    </template>
    <template v-else>
      <BasicLayout />
    </template>
  </div>
</template>

<style></style>
<script setup lang="ts">
import BasicLayout from "@/layouts/BasicLayout.vue";
import { useRoute, useRouter } from "vue-router";
import { useStore } from "vuex";
import { onMounted } from "vue";

const route = useRoute();
/*
 * 全局初始化函数，有全局单词调用的代码都写在这里
 */
const doInit = () => {
  console.log("welcome to mumubai's project");
};

onMounted(() => {
  doInit();
});
</script>
