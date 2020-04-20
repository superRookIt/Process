
		
   sql = "select salary*12 as year_s from m2";
   //as ~~(별칭) 일 경우 받아올때 ~~(별칭)을 입력
		
     try {
    
     c = datasource.getConnection();
     ps = c.prepareStatement(sql);
     rs = ps.executeQuery();

			
     while (rs.next()) {

      id = rs.getString("year_s"); 
      //as ~~(별칭) 일 경우 받아올때 ~~(별칭)을 입력

      }
	     
   }
			
			
			
