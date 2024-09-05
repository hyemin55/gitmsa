<template>
  <div>
<h1>안녕 VUE</h1>
 <MyAA :name="홍길동이"></MyAA>
 <MyAA :name="김길동이"></MyAA>
 <MyAA :name="박길동이"></MyAA>
  </div>
</template>

<script>
import MyAA from './components/MyAA.vue'

export default {
  components: {
    MyAA
  },
  setup () {
    

    return { MyAA }
  }
}
</script>

<style lang="scss" scoped>

</style>