//let orederEle=document.createElement('ol');
//let li1=document.createElement('li')
//li1.textContent='java';
//document.body.appendChild(orederEle);
//document.orederEle.appendChild(li1);






document.getElementById('orderid').innerHTML=
`<ol type="A">
        <li>java</li>
        <li>j2ee</li>
        <li>spring</li>
        <li>hibernate</li>
        <li>web services</li>
       </ol>

       <ol type="I">
            <li>apple</li>
            <li>Mango</li>
            <li>banana</li>
            <li>cashew</li>
            <li>jack fruit</li>
           </ol>

           <ol type="a">
                <li>pranali</li>
                <li>neha</li>
                <li>aishwarya</li>
                <li>janhavi</li>
               </ol>

               <ol type="i">
                    <li>souvik</li>
                    <li>vighnesh</li>
                    <li>shubham</li>
                    <li>vishal</li>
                   </ol>
               
                  <dl>
                     <dt>college list</dt>
                      <dd>PVPPCOE</dd>
                      <dd>K.J.Somaiya</dd>
                      <dd>Vidyalankar</dd>
                   </dl>
                    
                   <ol type="1">
                    <li>EXTC</li>
                 <ul>
                     <li>Pranali</li>
                     <li>Janhavi</li>
                     <li>Sujata</li>
                </ul>
                <li>IT</li>
                <li>COMPS</li>
                 </ol>`;

                 document.getElementById('formid').innerHTML=
                 `<form action="#">
                     <fieldset>
                 <legend>contact form</legend>
                 <div>
                     <label for="username">name</label><br>
                     <input type="text" id="username" name="username"><br>
                     <label for="">age</label><br>
                     <input type="number"><br>
                     <label for="address">Address</label><br>
                     <textarea name="address" id="" cols="30" rows="10"></textarea><br>
                     <label for="email id">emailid</label><br>
                     <input type="email"><br>
                     <label for="date" >date</label><br>
                     <input type="date" name="date" id="date"><br>
                     <label for="">Gender</label><br>
                     <input type="radio" name="male" id="gender">male
                     <input type="radio" name="female" id="gender">female
                     <input type="radio" name="other" id="gender">other
                 </div>
                 </fieldset>
             </form>`;
             
             document.getElementById('tableid').innerHTML=
             `<table border="1">
            <tr>
                <td>Name</td>
                <td>Ages</td>
                <td>Address</td>
                <td>DOB</td>
                <td>Email</td>
                <td>Gender</td>
            </tr>
            <tr>
                <td>Pranali</td>
                <td>21</td>
                <td>worli</td>
                <td>16/03/1998</td>
                <td>shirodkarpranali123@gmail.com</td>
                <td>female</td>
            </tr>
            <tr>
                    <td>Souvik</td>
                    <td>21</td>
                    <td>parel</td>
                    <td>11/03/1998</td>
                    <td>souvikdinda@gmail.com</td>
                    <td>male</td>
            </tr>
            <tr>
                    <td>Neha</td>
                    <td>21</td>
                    <td>jogeshwari</td>
                    <td>20/02/1998</td>
                    <td>nehaparab@gmail.com</td>
                    <td>female</td>
            </tr>
            <tr>
                    <td>Aishwarya</td>
                    <td>21</td>
                    <td>sion</td>
                    <td>13/5/1998</td>
                    <td>aishwaryathamke@gmail.com</td>
                    <td>female</td>
            </tr>
            </table>`