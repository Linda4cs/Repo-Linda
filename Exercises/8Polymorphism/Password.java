public class Password implements Encryptable
{
    private String message;
    private boolean encrypted;
    private int key; // XOR encryption key

    public Password(String msg)
    {
        message = msg;
        encrypted = false;
        key = 8484;
    }

    public void encrypt()
    {
        if (!encrypted)
        {
            StringBuilder encryptedMessage = new StringBuilder();
            for (int i = 0; i < message.length(); i++)
            {
                encryptedMessage.append((char)(message.charAt(i) ^ key));
            }
            message = encryptedMessage.toString();
            encrypted = true;
        }
    }


    public String decrypt()
    {
        if (encrypted)
        {
            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < message.length(); i++)
            {
                decryptedMessage.append((char)(message.charAt(i) ^ key));
            }
            message = decryptedMessage.toString();
            encrypted = false;
        }

        return message;
    }


    public boolean isEncrypted()
    {
        return encrypted;
    }


    public String toString()
    {
        return message;
    }
}
