// initial state
import { StoreOptions } from "vuex";
// getters
// actions 执行异步操作，并且触发更新mutation
// mutations 对变量进行增删改查的方法，尽量同步
export default {
  namespaced: true,
  state: () => ({
    loginUser: {
      userName: "未登录用户",
    },
  }),
  actions: {
    getLoginUser({ commit, state }, payload) {
      // todo 改为从远程请求获取登录信息
      commit("updateUser", { userName: "mumubai" });
    },
  },
  mutations: {
    // 修改全局用户变量
    updateUser(state, payload) {
      state.loginUser = payload;
    },
  },
} as StoreOptions<any>;
