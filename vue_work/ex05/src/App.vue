<template>
  <div>
    <h1>{{ myVar }}</h1>
    <div class="flex items-center justify-center">
    <TheHader />
    <RouterView></RouterView>
  </div>
  </div>
</template>

<script setup>
import TheHader from './components/TheHader.vue';
import { RouterView } from 'vue-router';

const myVar = "안녕하세요";

</script>

<style lang="scss" scoped></style>