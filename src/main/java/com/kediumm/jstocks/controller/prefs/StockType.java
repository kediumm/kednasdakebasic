/**
 * Copyright 2016 Miguel Vale Teixeira
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author: Miguel Vale Teixeira
 * @data: 2016/01/16
 * 
 */
package com.kediumm.jstocks.controller.prefs;

/**
 *
 *
 */
public enum StockType {

	COMMON("Common"),
	
	PREFERRED("Preferred")
    
    ;
	
	private String var_Value;
	
	private StockType(String par_Value) {
		
		var_Value = par_Value;
	}

	public String getValue() {
		
		return var_Value;
	}	
}
