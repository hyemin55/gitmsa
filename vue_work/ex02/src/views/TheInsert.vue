<template>
  <div>
    <h1>TheInsert</h1>
    <button @click="userSend">전송</button>
  </div>
</template>

<script>
export default {
  setup() {
    const mydata = {
      name: '하쵸핑',
      age: 30,
      email: 'qweqwe@naver.com',
      password: '1234',
      wdate: '2024-09-06T11:59:26.721963'
    }

    const userSend = () => {
      fetch('http://localhost:8080/user/insert', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(mydata)
      }).then((res) => {
        console.log(res)
      })
    }

    return { userSend }
  }
}
</script>

<style lang="scss" scoped></style>
