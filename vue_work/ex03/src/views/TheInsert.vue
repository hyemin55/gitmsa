<template>
  <div>
<h1 class="text-5xl">INSERT</h1>
<label for="email">email</label>
<input type="text" name="" id="email"v-model="email">
<button @click="doInsert" class="bg-green-700 text-white font-bold py-2 px-4 rounded">INSERT</button>

  </div>
</template>

<script>
import {ref} from 'vue';

export default {
  setup () {
    const email = ref('');
    const doInsert = () => {
      console.log(email.value);
      // fetch('http://localhost:8080/user/insert')
      // .then()
    }

    return {email, doInsert}
  }
}
</script>

<style  scoped>
h1{
  background-color: darkgreen;
  padding: 5px;
  display: inline-block;
  color: wheat;
}
</style>