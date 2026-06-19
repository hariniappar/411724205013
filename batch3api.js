fetch("https://jsonplaceholder.typicode.com/posts/6",
    {
        method:"PUT",
        headers:{
            'Content-Type':'application/json'
        },  
        body:JSON.stringify({
            title:"my post",
            body:"learning fetch",
            userId:1
        })
    }).then(response =>response.json()).then(data =>{console.log(data)});
