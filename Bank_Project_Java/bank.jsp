<html>
<head><title>OUR BANK</title></head>
<body>

<div style="background-image: url('https://jooinn.com/images/beautiful-blue-sky.jpg');">


<center><h1>OUR BANK</h1></center>
<h3>ACCOUNT CREATE</h3><br>
<form action= "accountOpen">
Account holder name:<input type = "text" name="name"><br>
phone number:<input type= "text" name="phoneNumber"><br>
<input type="submit"><br>
</form>

<h3>DEPOSITE AMOUNT</h3>
<form action="deposite">
Account Number:<input type="text" name="accountNumber"><br>
Deposite Amount:<input type="text" name="amount"><br>
<input type="submit"><br>
</form>

<h3>WITHDRAW AMOUNT</h3>
<form action="withdraw">
Account Number:<input type="text" name="accountNumber"><br>
Withdraw Amount:<input type="text" name="amount"><br>
<input type="submit"><br>
</form>

<h3>BALANCE</h3>
<form action="balance">
Account Number:<input type="text" name="accountNumber">
<input type="submit"><br>
</form>

<h3>TRANSACTION HISTORY</h3>
<form action="transactionHistory">
Account Number:<input type="text" name="accountNumber">
<input type="submit"><br>
</form>
</body>
</html>