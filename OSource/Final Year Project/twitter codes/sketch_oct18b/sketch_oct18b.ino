/* Post a simple message to Twitter  */
#if defined(ARDUINO) && ARDUINO > 18
#include <SPI.h>
#endif
#include <Ethernet.h>
//#include <EthernetDNS.h> // only for IDE 0022 or earlier
#include <Twitter.h>

byte mac[] = { 0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };
byte ip[] = { 10, 0, 0, 177 };
byte gateway[] = { 10, 0, 0, 1 };
byte subnet[] = { 255, 255, 0, 0 };

Twitter twitter("3912848054-QUbeAblW5LWSrmJluIemkAi1SXVp2qokrpmia9w");
char msg[] = "Hello, World! I'm Arduino!";

void setup()
{
  Ethernet.begin(mac, ip, gateway, subnet);
  Serial.begin(9600);

  delay(1000);

  Serial.println("connecting ...");
  if (twitter.post(msg)) {
    int status = twitter.wait(&Serial);
    if (status == 200) {
      Serial.println("OK.");
    } else {
      Serial.print("failed : code ");
      Serial.println(status);
    }
  } else {
    Serial.println("connection failed.");
  }
}

void loop()
{
}
