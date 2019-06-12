package com.jd.blockchain.ledger;

import com.jd.blockchain.binaryproto.DataContract;
import com.jd.blockchain.binaryproto.DataField;
import com.jd.blockchain.binaryproto.PrimitiveType;
import com.jd.blockchain.consts.DataCodes;

@DataContract(code= DataCodes.CONTRACT_RETURN)
public interface ContractReturnMessage {

    @DataField(order=1, primitiveType = PrimitiveType.INT32)
    int getOperationIndex();

    @DataField(order=2, primitiveType = PrimitiveType.TEXT)
    String getReturnMessage();

}
