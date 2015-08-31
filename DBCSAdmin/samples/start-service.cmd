@echo off

if "%1" == "" (
  echo "Sintax: start-service.cmd <service-name>"
  exit /b
)

java -cp DBCSCloudAdmin.jar -Dusername=eduardo.r.oliveira@oracle.com -Dpassword=mypwd -Didentity-domain=TRAINING32478477 -Dstorage-container=Storage-ORACLEGENZ132284244229/dbbackup -Dstorage-user=eduardo.r.oliveira@oracle.com -Dstorage-password=mypwd -Dssh-key="ssh-rsa  AAAAB3NzaC1yc2EAAAADAQABAAABAQDYj1XMnPcYgcQDu\\/L7x2DMfeQFe84echTwNfFUgnKH3HLyZ3D7rbUciRe+z2BNvsbZLR7VGkJMd3yx\\/zxHpYM8ZlDgyBFYPOpa186splZ3s8i2TxgLFbNji51uVeT8zFZWKgR5h5HEImIQ2FHCo9hDFfIfVrdxhRNhuObRcAftPdelqNtPa37eape7hcAWQAEF\\/T5O12GYROOmmVIJndJM\\/EQNU34OFQKSk+ijrhrc2jHRdfKr8mvLwt50JpQnZTGQ5ciUmEK7Evp\\/GF6bqfV5XyRTmQItLI6MStRGr2GgypeMyhwlWyvooS5rxNRzW9l+pK\\/nsHG\\/umZThn8gcTGP erolivei@EROLIVEI-BR" DBCSCloudAdminSampleUsage  action=start-service service-name=%1
