<template>
  <div>
    <h1 class="h1-red">TheFreeBoardView</h1>
    <div class="p-5">
      <div class="border border-b-slate-400 rounded p-3">
        <h1 class="font-bold">
          글제목 : <span class="font-normal">{{ title }}</span>
        </h1>
        <hr class="my-3" />
        <h1>글내용</h1>
        <p class="h-64">{{ content }}</p>
        <h1>작성일자  {{ regdate }}</h1>
        <h1>작성자  {{ creAuthor }}</h1>
      </div>
      <div v-for="item in list" :key="item">
        <img :src="`http://localhost:10000/file/download/${item.name}`" width="400" alt="">
        {{ item.name }}
      </div>
      <div class="flex justify-between mt-5">
        <button
          @click="pageMove(idx)"
          class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
        >
          수정
        </button>
        <button
          @click="doDelete(idx)"
          class="px-4 py-2 bg-blue-500 text-white font-semibold rounded-lg shadow-md hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-300"
        >
          삭제
        </button>
      </div>
    </div>
  </div>
</template>

<script setup>
import axios from 'axios'
import { ref } from 'vue'
import { useRoute, useRouter } from 'vue-router'

const route = useRoute()
const router = useRouter()
const title = ref('초기값')
const content = ref('초기값')
const regdate = ref('초기값')
const creAuthor = ref('초기값')
const list = ref([])
const idx = ref(0)

const doDelete = (idx) => {
  axios
    .delete(`http://localhost:10000/freeboard/delete/${idx}`)
    .then((res) => {
      // alert(res.data)
      // console.log(res)
      if (res.status == '200') {
        router.push({ name: 'freeboardlist' })
      }
    })
    .catch((e) => console.log(e))
}

const pageMove = () => {
  router.push({ name: 'freeboardupdate', query: { idx: idx.value } })
}

const getFreeBoard = () => {
  axios
    .get(`http://localhost:10000/freeboard/view/${route.params.idx}`)
    .then((res) => {
      title.value = res.data.title
      content.value = res.data.content
      regdate.value = res.data.regdate
      creAuthor.value = res.data.creAuthor
      idx.value = res.data.idx
      list.value = res.data.list
      console.log(res.data.list)
    })
    .catch((e) => {
      console.log(e)
      alert(e.response.data.message)
      router.push({ name: 'freeboardlist' })
    })
}

getFreeBoard()
</script>

<style lang="scss" scoped></style>
