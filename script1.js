console.log("A")
setTimeout(()=>{
    console.log("D")
},2000)
setTimeout(()=>{
    console.log("B")
},0)
console.log("C")

function example(){
    console.log("hello")
}
const example1=()=>{
    console.log("hi")
}

const promise=new Promise((resolve,reject)=>{
    setTimeout(example,4500)
    setTimeout(example1,0)
    // const success=true;
//     if(success){
//         console.log("done")
//     }
//     else{
//         console.log("fail")
//     }
})
promise.then(res=>{console.log(rev)})
.catch(err=>console.log(err))
