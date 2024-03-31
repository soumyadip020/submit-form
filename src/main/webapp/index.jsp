<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>submit form</title>
  <style>
    .container{
      width: 40%;
      border: 5px solid black;
      margin: auto;
      padding: 20px;
      font-size: 20px;

    }
  </style>
</head>
<body>
<div class="container">
  <h1>my form</h1>
  <form action="add"  method="post">
    <table>
      <tr>
        <td>enter your name</td>
        <td><input type="text" name="user_name" placeholder="enter name"></td>
      </tr>
      <tr>
        <td>enter your password</td>
        <td><input type="password" name="user_password" placeholder="enter here"></td>
      </tr>
      <tr>
        <td>enter your email</td>
        <td><input type="text" name="user_email" placeholder="enter here"></td>
      </tr>
      <tr>
        <td>select gender</td>
        <td><input type="radio" name="user_gender" value="male">male &nbsp; &nbsp;<input type="radio" name="user_gender">female</td>
        
      </tr>
      <tr>
        <td>select your course</td>
        <td><select name="user_course" id="">
          <option value="java">java</option>
          <option value="python">python</option>
          <option value="sql">sql</option>
          <option value="php">php</option>
        </select></td>
      </tr>
      <tr>
        <td style="text-align: right">
          <input type="checkbox" value="checked" name="condition">
        </td>
        <td>agree terms and conditions</td>
      </tr>
      <tr>
        <td><button type="submit">submit</button>
        <button type="reset">reset</button></td>


      </tr>
    </table>
  </form>
</div>
</body>
</html>