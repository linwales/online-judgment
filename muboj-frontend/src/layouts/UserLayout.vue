<template>
  <div id="userLaout">
    <a-layout style="min-height: 100vh">
      <a-layout-header class="header">
        <a-space>
          <img src="../assets/mumubai-logo.png" class="logo" />
          <div>MUB OJ</div>
        </a-space>
      </a-layout-header>
      <a-layout-content class="content">
        <router-view />
      </a-layout-content>
      <a-layout-footer class="footer">
        <a href="https://yupi.icu" target="_blank">
          oj判题系统 cover by 慕木白
        </a>
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<style scoped>
#userLaout {
  text-align: center;
  background: url("https://gw.alipayobjects.com/zos/rmsportal/FfdJeJRQWjEeGTpqgBKj.png")
    0% 0% / 100% 100%;
}

#userLaout .logo {
  width: 96px;
  height: 64px;
}

#userLaout .header {
  margin-top: 16px;
}

#userLaout .content {
  margin-bottom: 16px;
  padding: 20px;
}

#userLaout .footer {
  padding: 16px;
  position: sticky;
  bottom: 0;
  left: 0;
  right: 0;
  text-align: center;
}
</style>
<script></script>
