<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <div class="wrapper p-5 text-white text-3xl bg-violet-950">
      <nav class="flex space-x-5">
        <div>
          <RouterLink to="/">Home</RouterLink>
        </div>
        <div>
          <RouterLink to="/user">user</RouterLink>
        </div>
        <div class="group relative">
          <RouterLink to="/freeboardlist">FreeBoard</RouterLink>

          <div class="hidden group-hover:block absolute bg-violet-950 p-5 rounded opacity-80 ">
            <div>
              <RouterLink to="/freeboardlist">FreeBoardList</RouterLink>
            </div>
            <div>
              <RouterLink to="/freeboardinput">FreeBoardInput</RouterLink>
            </div>
          </div>
        </div>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped></style>
