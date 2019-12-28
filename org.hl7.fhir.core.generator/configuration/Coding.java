﻿      @Override
      public boolean supportsVersion() {
        return true;
      }

      @Override
      public boolean supportsDisplay() {
        return true;
      }


      public boolean is(String system, String code) {
        return hasSystem() && hasCode() &&  this.getSystem().equals(system) && this.getCode().equals(code);
      }
      
      public String toString() {
        String base = getSystem();
        if (hasVersion())
          base = base+"|"+getVersion();
        base = base + "#"+getCode();
        if (hasDisplay())
          base = base+": "+getDisplay();
        return base;
        
      } 
      
