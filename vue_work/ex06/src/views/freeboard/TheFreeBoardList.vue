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
          <tr class="hover:text-amber-500" v-for="item in arr" :key="item.idx">
            <td class="border text-center">{{ item.idx }}</td>
            <td class="border text-center cursor-pointer" @click="viewPage(item.idx)">
              {{ item.title }}
            </td>
            <td class="border text-center">{{ item.creAuthor }}</td>
            <td class="border text-center">{{ item.regDate }}</td>
            <td class="border text-center">{{ item.view_Count }}</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="flex justify-center mt-5">
      <ul class="flex space-x-2">
        <!-- 반복하고 싶은 태그에 v-for를 사용해주면 된다. -->
        <li
          class="cursor-pointer p-3"
          v-for="num in totalPages"
          v-bind:key="num"
          @click="setPageNum(num - 1)"
        >
          {{ num }}
        </li>
      </ul>
    </div>
  </div>
</template>
<!-- {{ this.$route.params.aa }} -->

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter();
const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0);

const setPageNum = (num) => {
  pageNum.value = num
  getFreeBoard(num);
 
}
const viewPage = (idx) => {
  const data = {name:'freeboardview', params:{idx}};
  router.push(data);
}

const getFreeBoard = (pageNum) => {
  if(pageNum==undefined) pageNum=0;
  // axios -> 페이지 호출되자마자 자동실행된다.
  axios
    .get(`http://localhost:10000/freeboard?pageNum=${pageNum}`)
    .then((res) => {
      arr.value = res.data.list
      totalPages.value = res.data.totalPages
    })
    .catch((e) => {
      console.log(e)
    })
}
// console.log('route.params.aa = ' + route.params.aa)
// console.log('route.params.bb = ' + route.params.bb)

getFreeBoard()
</script>

<style scoped>
.h1 {
  color: chocolate;
  margin: 10px 0 10px 30px;
  font-weight: 700;
}
</style>
