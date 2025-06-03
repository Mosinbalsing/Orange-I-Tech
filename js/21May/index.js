var body =  document.getElementsByTagName("body")[0];
var div = document.createElement("div");
div.innerHTML = "<h1>Welcome to my website</h1>";
div.id="myDiv";
div.style.backgroundColor = "lightblue";
div.style.padding = "100px";
div.style.textAlign = "center";
body.style.backgroundColor = "lightgreen";
div.className = "myDiv";
body.appendChild(div);
console.log(body);
let c=0;
var btn = document.createElement("button");
btn.innerHTML = "Click me";
btn.style.backgroundColor = "black";
btn.style.color = "white";
btn.style.padding = "10px";
btn.style.border = "none";
btn.style.borderRadius = "5px";
btn.style.cursor = "pointer";
btn.style.fontSize = "20px";
btn.style.marginTop = "20px";
btn.style.marginBottom = "20px";
btn.style.width = "200px";
btn.style.height = "50px";
btn.style.fontFamily = "Arial, sans-serif";
btn.style.fontWeight = "bold";
body.appendChild(btn);
btn.addEventListener("click", function() {
    CreateTable();
    div.className = "myDiv2";
    if (div.style.backgroundColor == "lightblue") {
        div.style.backgroundColor = "black";
        div.style.color = "white";
    } else {
        div.style.backgroundColor = "lightblue";
        div.style.color = "black";
    }
    for (let index = 1; index <=8; index++) {
        const checkbox = document.createElement("input");
        checkbox.type = "checkbox";
        checkbox.id = "myCheckbox";
        checkbox.name = "myCheckbox";
        checkbox.value = "myCheckbox";
        if (index % 2 == 0) {
            checkbox.checked = true;    
        }
        body.appendChild(checkbox);
        
    }

    console.log(++c);
});

function CreateTable(){
    var table  =  document.createElement("table");
    table.style.width = "100%";
    table.style.border = "1px solid black";
    var tr = document.createElement("tr");
    var th = document.createElement("th");
    var td = document.createElement("td");
    for(let index = 0; index < 5; index++) {
        th.innerHTML = "Header" + (index + 1);
        th.style.border = "1px solid black";
        tr.appendChild(th);
        table.appendChild(tr);
    }
    for(let index = 0; index < 5; index++) {
        td.innerHTML = "Data" + (index + 1);
        td.style.border = "1px solid black";
        tr.appendChild(td);
        table.appendChild(tr);
    }
    body.appendChild(table);
}




// setTimeout(() => {
//     div.className="myDiv2";
//     if(div.style.backgroundColor = "lightblue"){
//         div.style.backgroundColor = "black";
//     }
//     else{
//         div.style.backgroundColor = "lightblue";
//     }
//     console.log(++c);
    
//     // body.removeChild(div);
// }, 3000);
