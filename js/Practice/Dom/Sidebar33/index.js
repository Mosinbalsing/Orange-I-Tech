let btn = document.querySelector('button')
let sidebar = document.querySelector('.sidebar')

btn.addEventListener('click', () => {
    sidebar.classList.toggle('show')
})