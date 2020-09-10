/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var scroll = new SmoothScroll('a[href*="#"]');
    function read(){
    	var dots=document.getElementById("dots");
    	var moreText=document.getElementById("more");
    	var btnText=document.getElementById("button");
    	if(dots.style.display==="none"){
    		dots.style.display="inline";
            moreText.style.display="none";
            btnText.innerHTML="Read More";
    	}
    	else{
            dots.style.display="none";
            moreText.style.display="inline";
            btnText.innerHTML="Read Less";
    	}
    }
    var currdate = new Date();
    var yyyy=currdate.getFullYear();
    var mm=currdate.getMonth()+1;    //january is 0
    var dd=currdate.getDate();
    if (dd<10) {
    	dd='0'+dd;
    }
    if (mm<10) {
    	mm='0'+mm;
    }
    currdate=yyyy+'-'+mm+'-'+dd;
    dd=dd+30;
    var maxdate=yyyy+'-'+mm+'-'+dd;
    document.getElementById("Check-in").setAttribute("min",currdate);
    document.getElementById("Check-out").setAttribute("min",currdate);
    document.getElementById("Check-out").setAttribute("max",maxdate);
//    var =document.getElementById("Check-in").getAttribute("min");
//    document.getElementById("Check-out").setAttribute("min",);
function showPrice()
            {
                var c_in=document.getElementById("Check-in").value;
                var c_out=document.getElementById("Check-out").value;
                var hname=document.getElementById("hn").value;
//                console.log(hname);
                var xmlhttspobject;
                if(window.XMLHttpRequest)
//                    alert("yes supported by browser");
                    xmlhttpobject=new XMLHttpRequest();
                else
                    xmlhttpobject=new ActiveXObject("Microsoft.XMLHTTP");
                
                xmlhttpobject.onreadystatechange=function()
                {
//                    alert("Ready state value:- "+xmlhttpobject.readyState);
                    if(xmlhttpobject.readyState===4 && xmlhttpobject.status===200){
//                        alert(xmlhttpobject.responseText);
                        document.getElementById("addcontent").innerHTML=xmlhttpobject.responseText;
                    }
                };
                xmlhttpobject.open("GET","price?value1="+c_in+"&value2="+c_out+"&value3="+hname,true);//we can pass any parameter in url but same parameter should be used in getParameter
                xmlhttpobject.send();
                //document.getElementById() return object of input
            }
