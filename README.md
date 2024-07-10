
# Project Layout  : 

```diff
! Bharat Gas Agency CRM Tool In Java !
```

## 1. Package Gas Supplier
### Interface gasAgency

| Attribute          | Description          |
|--------------------|----------------------|
| agencyName         | Name of the agency   |
| agencyCode         | Unique code of agency|
| phoneNumber        | Contact number       |
| agencyDisplay      | Function to display agency details |

## 2. Package Customer
### Class Customers

| Attribute     | Description          |
|---------------|----------------------|
| name          | Name of the customer |
| mobile number | Contact number       |
| address       | Address details      |
| street        | Street name          |
| area          | Area name            |
| pin code      | Postal code          |

## 3. Package Customers
### Class Gas Connection

| Attribute           | Description                 |
|---------------------|-----------------------------|
| connectionNumber    | Unique connection number    |
| No of Cylinder      | Number of cylinders         |
| Last Booking Date   | Date of the last booking    |


## 4. Package Gas Booking
###  Class Booking

| Attribute           | Description                 |
|---------------------|-----------------------------|
| otp , amount, refund| Unique connection number    |
| Dates               | Number of cylinders         |
| status              | Date of the last booking    |


## 5.Package Gas booking
### Class Delivery

| Attribute           | Description                 |
|---------------------|-----------------------------|
|DeliveryPersonName   | Delivery person Name        |
| OTP                 | OTP for delivery            |
| Amount Calculation  | Paying amount calculation   |
  
