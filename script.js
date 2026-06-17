console.log("hello")
const first=1;
const second=2;
console.log(first);
const str="hariniappar";
console.log(str);
const colour=["blue","green","white"]
console.log(colour[0])
colour[1]="black"
console.log(colour[1])
const arr=["name",1,false,2.4]
console.log(arr)
for(let i=0;i<arr.length;i++){
    console.log(arr[i])
}
const a=document.getElementById("ptag")
a.innerHTML="this my fourth class"
function abs(){
    console.log("I am writing something")
}
const input = document.getElementById("eventlistener")
const output = document.getElementById("Ptag")
input.addEventListener("input", ()=>{
    output.textContent = input.value
})
const newvar=document.createElement("h1")
newvar.textContent="new paragraph";
document.body.appendChild(newvar);
newvar.remove()