let username=(name)=>{
    let len = name.length;
    let username ="@"+ name.toLowerCase().replace(/ /g, "_")+"_" + len;
    return username;
}
console.log(username("John Doe"))