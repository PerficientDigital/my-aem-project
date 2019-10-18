module.exports = {
    // default working directory
    context: __dirname,

    // path to the clientlib root folder
    clientLibRoot: "./../ui.apps/src/main/content/jcr_root/apps/my-aem-project/clientlibs",

    libs: {
        name: "react-app",
        allowProxy: true,
        categories: ["com.surajkamdi-aem-project.react"],
        serializationFormat: "xml",
        jsProcessor: ["min:gcc"],
        dependencies:["my-aem-project.grid"],
        assets: {
            js: [
                "build/static/**/*.js"
            ],
            css: [
                "build/static/**/*.css"
            ]
        }
    }
};