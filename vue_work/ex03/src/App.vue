<template>
  <div>
    <h1 class="text-5xl">안녕 tailwind</h1>
    <div class="flex space-x-5 p-5 bg-slate-500">
      <router-link class="text-white hover:text-gray-200" to="/">HOME</router-link>
      <router-link class="text-white hover:text-gray-200" to="/insert">insert</router-link>
      <router-link class="text-white hover:text-gray-200" to="/select">select</router-link>
      <router-link class="text-white hover:text-gray-200" to="/update">update</router-link>
      <router-link class="text-white hover:text-gray-200" to="/delete">delete</router-link>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  setup() {
    return {}
  }
}
</script>

<style lang="scss" scoped></style>
