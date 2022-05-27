package com.techbank.cqrs.core.commands;

import com.techbank.cqrs.core.messages.Messages;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseCommand extends Messages {
    public BaseCommand(String id) {
        super(id);
    }
}
