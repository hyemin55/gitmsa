<template>
  <div class="pb-10">
    <h1 class="h1-red">FreeBoardList</h1>
    <div class="px-5">
      <table class="border border-b-gray-500 w-full">
        <thead>
          <th class="border">idx</th>
          <th class="border">title</th>
          <th class="border">author</th>
          <th class="border">regdate</th>
          <th class="border">viewcount</th>
        </thead>
        <tbody>
          <!-- key 는 유니크한 값을 넣어줘야한다. -->
          <tr v-for="item in arr" :key="item.idx"> 
            <td class="border text-center">{{ item.idx }}</td>
            <td class="border text-center">{{ item.title }}</td>
            <td class="border text-center">{{ item.creAuthor }}</td>
            <td class="border text-center">{{ item.regDate }}</td>
            <td class="border text-center">{{ item.view_Count }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>
<!-- {{ this.$route.params.aa }} -->

<script setup>
import axios from 'axios'
import { ref } from 'vue';
import { useRoute } from 'vue-router'

const route = useRoute()
const arr = ref([]);

console.log('route.params.aa = ' + route.params.aa)
console.log('route.params.bb = ' + route.params.bb)

axios
  .get('http://localhost:8080/freeboard')
  .then((res) => {
    console.log(res)
    arr.value = res.data;
  })
  .catch((e) => {
    console.log(e)
  })
</script>

<style scoped>
.h1 {
  color: chocolate;
  margin: 10px 0 10px 30px;
  font-weight: 700;
}
</style>
