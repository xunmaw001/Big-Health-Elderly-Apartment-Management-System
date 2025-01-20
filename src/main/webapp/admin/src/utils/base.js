const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm05293/",
            name: "ssm05293",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "大健康老年公寓管理系统"
        } 
    }
}
export default base
