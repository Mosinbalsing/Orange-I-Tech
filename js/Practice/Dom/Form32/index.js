let btn = document.querySelector('button')
let input = document.querySelector('input')

btn.addEventListener('click', () => {
    console.log(input.type);
    if(input.type==="password"){
        input.type="text"
        btn.innerText="Hide"
    }
    else{
        input.type="password"
        btn.innerText="Show"
    }
    
})