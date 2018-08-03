package jd

typealias StringList = List<String>
//typealias MutableStringList = MutableList<String>

sealed class OpCode
{

}

data class OpTypeDef (val name : String , val fields : StringList) : OpCode()
{

}




data class OpTypeRef(val name : String) : OpCode()
{

}

data class OpRecord (val name : String , val fields : StringList)  : OpCode()
{

}

data class OpWrite(val foo : Byte = 0) : OpCode()
{

}

data class OpHeader(val foo : Byte = 0) : OpCode()
{

}


data class OpCopy(val name : String) : OpCode()
{

}



data class OpSet(val name :String , val x : String) : OpCode()
{
}








