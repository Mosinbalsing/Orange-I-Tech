//1**********
// let arr =[1,2,3,4,5]
// function lastelement(arr){
//     return arr[arr.length-1]
// }
// console.log(lastelement(arr));

//2*******************

// let arr1= [1,2,3,4,5]
// let arr2= [6,7,8,9,10]
// let combine = arr1.concat(arr2)
// let arr3 = [...arr1,...arr2]
// console.log(combine);
// console.log(arr3);

//3**************

// let number = Math.floor(Math.random()*19)
// console.log(number);

//4 **************

// let arr = [1,4,'Mosin' , 'b', 7,9.0]
// let arr1 = arr.filter((item) => typeof item === 'number')
// let arr2 = arr.filter((item) => typeof item === 'string')
// console.log(arr1); 
// console.log(arr2);

//5 **************
// let arr = [1,2,3,4,5]
// console.log(Math.max(...arr));


//6**************
// let obj = {
//     name: 'mosin',
//     age: 20,
//     gender: 'male'
// }
// let getlenth = (obj) => Object.keys(obj).length
// console.log(getlenth(obj));

//7******************

// let arrobj = [{
//     name: 'mosin',
//     age: 20,
//     gender: 'male'
// }, {
//     name: 'sneha'
//     , age: 21,
//     gender: 'female'
// },
// {
//     name: 'vishal'
//     , age: 22,
//     gender: 'male'
// }, {
//     name: 'priya',
//     age: 23,
//     gender: 'female'
// }
// ]
// let arrmale = arrobj.filter((item) => item.gender === 'male')
// let arrfemale = arrobj.filter((item) => item.gender === 'female')
// console.log(arrmale);
// console.log(arrfemale);

//8 **************

// let arrofsrt =['mosin','sneha','vishal','priya']
// let uppercase = arrofsrt.map((item) => item.toUpperCase())
// console.log(uppercase);


//9**************

// let obj = {}

// console.log(Object.keys(obj).length==0);/

//10******************
// let arr = [1,2,3,4,5]
// let double = arr.map((item)=>item*2)
// console.log(double);

//11******************
// let arr = [1,4,'Mosin' , 'b', 7,9.0]
// let arr2 = arr.join(',')//by Default is comma
// console.log(typeof arr2);
// console.log(arr.join('and ')); //space is used instead of comma

//12*******************

// let arr =[1,2,3,4,['a','b','c'],5]
// console.log(arr.flat(1));

//13*************************
// let arr = [
//     1, 2, 3, 4,
//     'a', 'b', 'c', 5
// ]
// console.log(arr.every((item) => typeof item === 'number'));

// console.log(5+'5'-5*9);

//14*************************
// function isPrime(num){
//     if(num<2){
//         return false
//     }
//     for(let i=2;i<=Math.sqrt(num);i++){
//         if(num%i===0){
//             return false
//         }
//     }
//     return true
// }
// console.log(isPrime(49));

//15*************************
// let arr = [1, 2, 3, 4, 5, 6,5 , 4 , 3 ,2,2]
// let set = new Set(arr)
// console.log([...set]);

// let resultarr = arr.filter((item,index) => arr.indexOf(item) === index)
// console.log(resultarr);


// let obj = {
//     name: 'mosin',
//     age: 20,
//     gender: 'male'
// }
// let obj2 = { 
//     address:'Katraj Pune',
//     city:'pune'
//  }
//  let sum = {...obj,...obj2}
//  console.log(sum);

//21***********

// let sentence = 'I am a software developer'
// let arr = sentence.split(' ').map((word)=>word.split('').reverse().join(''));
// console.log(arr.join(' '));

//22************
// let arr = [1,4,'Mosin' , 'b', 7,9.0]
// let sum=0
// let arr1 = arr.forEach((item) =>
// {
//     if(typeof item === 'number'){
//         sum+=item
//     }
// }
// );
// console.log(sum);

//******
// let num = 12345
// console.log(num.toFixed(2));
// console.log(Number.isInteger(num));
// console.log(num%1 === 0?true:false);


//23******
//magic Number
// let num= 2575;
// let sum = 0;
// while(num>0 || sum>9){
//     if (num === 0) {
//         num = sum;
//         sum = 0;
//     }
//     let remainder = num % 10;
//     console.log(remainder);
//     sum += remainder;
//     num = Math.floor(num/10);
// }


//24******
// function reverseNumber(num){
//     console.log(Number(num.toString().split('').reverse().join('')));
// }
// reverseNumber(123)

//25******

// let string = "Mosin Maheboob Balsing"

// function sortString(string){
//     console.log(string.split(' ').sort().join(' '));
// }
// sortString(string)

// //26******
// let str = "msoin maheboob balsing"

// function sortString(str) {
//     let words = str.split(' ').map(word => {
//         return word.charAt(0).toUpperCase() + word.slice(1).toLowerCase();
//     });
//     console.log(words.join(' '));
//     return words.join(' ');
// }
// let num = sortString(str)
// console.log(num);

//Binary
// let num = 39
// let str = ''
// while (num>0) {
//     let digit = num%2
//     num = Math.floor(num/2)
//     console.log(digit);
//     str = digit.toString() + str
// }
// console.log(str);

//27*************
function getArrelement(arr , n){
    if(!n){
        return arr[0]
    }else if(n >arr.length){
        return null
    }else{
        return arr.slice(0,n)
    }
} 
//console.log(getArrelement([1,2,3,4,5], 5))

//28***********
function getOccurence(str){
    let obj = {}
    console.log(str.split(''));
    str.split('').forEach((value) => {
        if(obj.hasOwnProperty(value)){
            obj[value]++
        }else{
            obj[value] = 1
        }
    })
    for(let key in obj){
        console.log(`${key} : ${obj[key]}`);
    }
    return obj
}
// console.log(getOccurence("Hello, World!"));




