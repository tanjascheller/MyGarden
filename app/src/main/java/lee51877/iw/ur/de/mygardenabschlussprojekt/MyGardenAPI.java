package lee51877.iw.ur.de.mygardenabschlussprojekt;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;

/**
 * Created by Ema on 28.07.2015.
 */
public class MyGardenAPI extends DefaultApi10a{
    @Override
    public String getAccessTokenEndpoint()
    {
        return MyGardenConstants.ACCESS_TOKEN;
    }

    @Override
    public String getRequestTokenEndpoint()
    {
        return MyGardenConstants.REQUEST_TOKEN;
    }

    @Override
    public String getAuthorizationUrl(Token requestToken)
    {
        return String.format(MyGardenConstants.AUTHORIZE_URL, requestToken.getToken());
    }
}
