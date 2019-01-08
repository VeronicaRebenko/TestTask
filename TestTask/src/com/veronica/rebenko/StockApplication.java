package com.veronica.rebenko;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// Identify the base URL with annotation @ApplicationPath
@ApplicationPath("restfulstocks")
public class StockApplication extends Application {
}